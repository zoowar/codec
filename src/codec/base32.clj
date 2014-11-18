(ns codec.base32
  (:import [org.apache.commons.codec.binary Base32]))

(defn encode
  "Returns a base32 encoded byte array"
  [^bytes b]
     (let [x (new Base32)]
       (.encode x b)))

(defn encode-str
  "Returns a base32 encoded string"
  [^bytes b]
  (let [base32 (new Base32)]
    (.encodeToString base32 b)))