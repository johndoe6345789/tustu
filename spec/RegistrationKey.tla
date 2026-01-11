-------------------------- MODULE RegistrationKey --------------------------
(*
  TLA+ Specification for Registration Key Generation Algorithm
  
  This specification describes the registration key generation algorithm
  used for product licensing, including obfuscation, hashing, and encoding.
*)

EXTENDS Integers, Sequences, FiniteSets, TLC

CONSTANTS
    MAX_STRING_LENGTH,      \* Maximum length of input strings
    ASCII_MIN,              \* Minimum ASCII value (32)
    ASCII_MAX               \* Maximum ASCII value (122)

VARIABLES
    firstName,              \* User's first name
    lastName,               \* User's last name  
    productName,            \* Name of the product
    email,                  \* User's email address
    secret,                 \* Secret seed value
    additionalField1,       \* Optional additional field 1
    additionalField2,       \* Optional additional field 2
    additionalField3,       \* Optional additional field 3
    
    \* Algorithm state variables
    phase,                  \* Current phase of algorithm
    byteArray,              \* Working byte array
    position,               \* Current position in array
    hashDigest,             \* MD5 hash result
    checksum,               \* CRC checksum bytes
    registrationKey         \* Final registration key

vars == <<firstName, lastName, productName, email, secret, 
          additionalField1, additionalField2, additionalField3,
          phase, byteArray, position, hashDigest, checksum, registrationKey>>

-----------------------------------------------------------------------------
(* Type Definitions *)

Phases == {
    "Init",
    "Concatenate",
    "Reverse",
    "Transform",
    "SpecialCharHandle",
    "HashInput",
    "MD5Round1",
    "MD5Round2", 
    "MD5Discard",
    "MD5Round3",
    "MD5Final",
    "Checksum",
    "Combine",
    "Encode",
    "Complete"
}

ValidString(s) == 
    /\ s \in Seq(ASCII_MIN..ASCII_MAX)
    /\ Len(s) > 0
    /\ Len(s) <= MAX_STRING_LENGTH

Base32Charset == "123456789ABCDEFGHIJKLMNPQRSTUVWXYZ"
Base32EnhancedCharset == "23456789ABCDEFGHJKLMNPQRSTUVWXYZ"

SpecialCharacters == {96, 92, 91, 93, 59, 46}  \* `, \, [, ], ;, .

-----------------------------------------------------------------------------
(* Initial State *)

Init ==
    /\ firstName \in Seq(ASCII_MIN..ASCII_MAX)
    /\ lastName \in Seq(ASCII_MIN..ASCII_MAX)
    /\ productName \in Seq(ASCII_MIN..ASCII_MAX)
    /\ email \in Seq(ASCII_MIN..ASCII_MAX)
    /\ secret \in Seq(ASCII_MIN..ASCII_MAX) \cup {<<>>}
    /\ additionalField1 \in Seq(ASCII_MIN..ASCII_MAX) \cup {<<>>}
    /\ additionalField2 \in Seq(ASCII_MIN..ASCII_MAX) \cup {<<>>}
    /\ additionalField3 \in Seq(ASCII_MIN..ASCII_MAX) \cup {<<>>}
    /\ ValidString(firstName)
    /\ ValidString(lastName)
    /\ ValidString(productName)
    /\ ValidString(email)
    /\ phase = "Init"
    /\ byteArray = <<>>
    /\ position = 1
    /\ hashDigest = <<>>
    /\ checksum = <<>>
    /\ registrationKey = <<>>

-----------------------------------------------------------------------------
(* Algorithm Phase 1: Concatenation *)

Concatenate ==
    /\ phase = "Init"
    /\ byteArray' = lastName \o productName \o firstName \o lastName \o email
    /\ phase' = "Reverse"
    /\ UNCHANGED <<firstName, lastName, productName, email, secret,
                   additionalField1, additionalField2, additionalField3,
                   position, hashDigest, checksum, registrationKey>>

-----------------------------------------------------------------------------
(* Algorithm Phase 2: Byte Reversal *)

ReverseBytes ==
    /\ phase = "Reverse"
    /\ position <= Len(byteArray) \div 2
    /\ LET idx1 == position
           idx2 == Len(byteArray) - position + 1
           temp == byteArray[idx1]
       IN
           /\ byteArray' = [byteArray EXCEPT 
                ![idx1] = byteArray[idx2],
                ![idx2] = temp]
           /\ position' = position + 1
           /\ UNCHANGED <<firstName, lastName, productName, email, secret,
                          additionalField1, additionalField2, additionalField3,
                          phase, hashDigest, checksum, registrationKey>>

CompleteReverse ==
    /\ phase = "Reverse"
    /\ position > Len(byteArray) \div 2
    /\ phase' = "Transform"
    /\ position' = 1
    /\ UNCHANGED <<firstName, lastName, productName, email, secret,
                   additionalField1, additionalField2, additionalField3,
                   byteArray, hashDigest, checksum, registrationKey>>

-----------------------------------------------------------------------------
(* Algorithm Phase 3: Character Transformation *)

TransformByte(b, idx) ==
    LET base == (b + ((b - 32) % 7)) - (idx % 4)
    IN IF base > 122 THEN base - 9 ELSE base

TransformBytes ==
    /\ phase = "Transform"
    /\ position <= Len(byteArray)
    /\ LET b == byteArray[position]
           transformed == TransformByte(b, position - 1)
       IN
           /\ byteArray' = [byteArray EXCEPT ![position] = transformed]
           /\ position' = position + 1
           /\ UNCHANGED <<firstName, lastName, productName, email, secret,
                          additionalField1, additionalField2, additionalField3,
                          phase, hashDigest, checksum, registrationKey>>

CompleteTransform ==
    /\ phase = "Transform"
    /\ position > Len(byteArray)
    /\ phase' = "SpecialCharHandle"
    /\ position' = 1
    /\ UNCHANGED <<firstName, lastName, productName, email, secret,
                   additionalField1, additionalField2, additionalField3,
                   byteArray, hashDigest, checksum, registrationKey>>

-----------------------------------------------------------------------------
(* Algorithm Phase 4: Special Character Handling *)

HandleSpecialChar(b, idx) ==
    IF b \in SpecialCharacters
    THEN b + 6 + (idx % 10)
    ELSE b

HandleSpecialChars ==
    /\ phase = "SpecialCharHandle"
    /\ position <= Len(byteArray)
    /\ LET b == byteArray[position]
           adjusted == HandleSpecialChar(b, position - 1)
       IN
           /\ byteArray' = [byteArray EXCEPT ![position] = adjusted]
           /\ position' = position + 1
           /\ UNCHANGED <<firstName, lastName, productName, email, secret,
                          additionalField1, additionalField2, additionalField3,
                          phase, hashDigest, checksum, registrationKey>>

CompleteSpecialChar ==
    /\ phase = "SpecialCharHandle"
    /\ position > Len(byteArray)
    /\ phase' = IF secret = <<>> THEN "Complete" ELSE "HashInput"
    /\ position' = 1
    /\ UNCHANGED <<firstName, lastName, productName, email, secret,
                   additionalField1, additionalField2, additionalField3,
                   byteArray, hashDigest, checksum, registrationKey>>

-----------------------------------------------------------------------------
(* Algorithm Phase 5: MD5 Hashing (Abstract) *)

PrepareHashInput ==
    /\ phase = "HashInput"
    /\ byteArray' = byteArray \o secret
    /\ phase' = "MD5Round1"
    /\ UNCHANGED <<firstName, lastName, productName, email, secret,
                   additionalField1, additionalField2, additionalField3,
                   position, hashDigest, checksum, registrationKey>>

MD5Round1 ==
    /\ phase = "MD5Round1"
    /\ phase' = "MD5Round2"
    /\ UNCHANGED <<firstName, lastName, productName, email, secret,
                   additionalField1, additionalField2, additionalField3,
                   byteArray, position, hashDigest, checksum, registrationKey>>

MD5Round2 ==
    /\ phase = "MD5Round2"
    /\ phase' = "MD5Discard"
    /\ UNCHANGED <<firstName, lastName, productName, email, secret,
                   additionalField1, additionalField2, additionalField3,
                   byteArray, position, hashDigest, checksum, registrationKey>>

MD5Discard ==
    /\ phase = "MD5Discard"
    /\ phase' = "MD5Round3"
    /\ UNCHANGED <<firstName, lastName, productName, email, secret,
                   additionalField1, additionalField2, additionalField3,
                   byteArray, position, hashDigest, checksum, registrationKey>>

MD5Round3 ==
    /\ phase = "MD5Round3"
    /\ phase' = "MD5Final"
    /\ UNCHANGED <<firstName, lastName, productName, email, secret,
                   additionalField1, additionalField2, additionalField3,
                   byteArray, position, hashDigest, checksum, registrationKey>>

MD5Final ==
    /\ phase = "MD5Final"
    /\ \E digest \in Seq(0..255): 
        /\ Len(digest) = 16  \* MD5 produces 16 bytes
        /\ hashDigest' = digest
        /\ phase' = "Checksum"
    /\ UNCHANGED <<firstName, lastName, productName, email, secret,
                   additionalField1, additionalField2, additionalField3,
                   byteArray, position, checksum, registrationKey>>

-----------------------------------------------------------------------------
(* Algorithm Phase 6: Checksum Generation *)

GenerateChecksum ==
    /\ phase = "Checksum"
    /\ \E crc \in Seq(0..255):
        /\ Len(crc) = 4  \* 4-byte checksum
        /\ checksum' = crc
        /\ phase' = "Combine"
    /\ UNCHANGED <<firstName, lastName, productName, email, secret,
                   additionalField1, additionalField2, additionalField3,
                   byteArray, position, hashDigest, registrationKey>>

-----------------------------------------------------------------------------
(* Algorithm Phase 7: Combine Checksum and Hash *)

CombineChecksumHash ==
    /\ phase = "Combine"
    /\ byteArray' = checksum \o hashDigest  \* 4 + 16 = 20 bytes
    /\ phase' = "Encode"
    /\ position' = 1
    /\ UNCHANGED <<firstName, lastName, productName, email, secret,
                   additionalField1, additionalField2, additionalField3,
                   hashDigest, checksum, registrationKey>>

-----------------------------------------------------------------------------
(* Algorithm Phase 8: Base-32 Encoding *)

Base32Encode(b, charset) ==
    LET charsetLen == Len(charset)
        idx == (IF b < 0 THEN -b ELSE b) % charsetLen
    IN charset[idx + 1]

EncodeBytes ==
    /\ phase = "Encode"
    /\ position <= Len(byteArray)
    /\ LET charset == IF additionalField1 = <<>> /\ additionalField2 = <<>>
                      THEN Base32Charset
                      ELSE Base32EnhancedCharset
           b == byteArray[position]
           encoded == Base32Encode(b, charset)
       IN
           /\ registrationKey' = Append(registrationKey, encoded)
           /\ position' = position + 1
           /\ UNCHANGED <<firstName, lastName, productName, email, secret,
                          additionalField1, additionalField2, additionalField3,
                          phase, byteArray, hashDigest, checksum>>

CompleteEncode ==
    /\ phase = "Encode"
    /\ position > Len(byteArray)
    /\ phase' = "Complete"
    /\ Len(registrationKey) = 20  \* Final key is 20 characters
    /\ UNCHANGED <<firstName, lastName, productName, email, secret,
                   additionalField1, additionalField2, additionalField3,
                   byteArray, position, hashDigest, checksum, registrationKey>>

-----------------------------------------------------------------------------
(* Next State Relation *)

Next ==
    \/ Concatenate
    \/ ReverseBytes
    \/ CompleteReverse
    \/ TransformBytes
    \/ CompleteTransform
    \/ HandleSpecialChars
    \/ CompleteSpecialChar
    \/ PrepareHashInput
    \/ MD5Round1
    \/ MD5Round2
    \/ MD5Discard
    \/ MD5Round3
    \/ MD5Final
    \/ GenerateChecksum
    \/ CombineChecksumHash
    \/ EncodeBytes
    \/ CompleteEncode

Spec == Init /\ [][Next]_vars

-----------------------------------------------------------------------------
(* Invariants *)

TypeInvariant ==
    /\ phase \in Phases
    /\ byteArray \in Seq(Int)
    /\ position \in Nat
    /\ hashDigest \in Seq(0..255)
    /\ checksum \in Seq(0..255)
    /\ registrationKey \in Seq(Int)

ValidInputs ==
    /\ ValidString(firstName)
    /\ ValidString(lastName)
    /\ ValidString(productName)
    /\ ValidString(email)

PhaseOrder ==
    /\ phase = "Complete" => Len(registrationKey) = 20
    /\ phase \in {"MD5Round1", "MD5Round2", "MD5Discard", "MD5Round3", "MD5Final"} 
       => secret # <<>>

FinalKeyLength ==
    phase = "Complete" => Len(registrationKey) = 20

Deterministic ==
    \* Same inputs always produce the same key
    /\ phase = "Complete"
    /\ phase' = "Complete"
    => registrationKey = registrationKey'

NoEmptyKey ==
    phase = "Complete" => registrationKey # <<>>

-----------------------------------------------------------------------------
(* Properties *)

THEOREM Correctness == Spec => []TypeInvariant

THEOREM Termination == Spec => <>(phase = "Complete")

THEOREM Uniqueness == 
    \* Different inputs produce different keys (with high probability)
    /\ Spec
    /\ firstName # firstName'
    /\ phase = "Complete"
    /\ phase' = "Complete"
    => registrationKey # registrationKey'

=============================================================================
