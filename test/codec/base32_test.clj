(ns codec.base32-test
  (:require [clojure.test :refer :all]
            [codec.base32 :refer :all]))

;; https://tools.ietf.org/html/rfc4648#section-10
(def data
  [["" ""]
   ["f" "MY======"]
   ["fo" "MZXQ===="]
   ["foo" "MZXW6==="]
   ["foob" "MZXW6YQ="]
   ["fooba" "MZXW6YTB"]
   ["foobar" "MZXW6YTBOI======"]])

(deftest a-test
  (testing "encode-str"
    (doseq [[i o] data]
      (is (= (encode-str (.getBytes i)) o)))
    (is (thrown? RuntimeException (encode-str "string")))))
