(ns learning-clojure.numbers
  (:require [clojure.math.numeric-tower :as nt]))

;
; Find PI to the Nth Digit
;
(defn pifun [k]
   (* (nt/expt 16 (- k))
     (- (/ 4 (+ (* 8 k) 1))
        (/ 2 (+ (* 8 k) 4))
        (/ 1 (+ (* 8 k) 5))
        (/ 1 (+ (* 8 k) 6)))))

(defn n-pi-digits [n]
  (format (str "%." n "f") (double (reduce + (map pifun (range n))))))

(n-pi-digits 7)


;
; End
;


