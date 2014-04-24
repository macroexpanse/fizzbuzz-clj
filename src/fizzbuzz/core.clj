(ns fizzbuzz.core)

(defn check-fizzbuzz [i]
  (cond
    (= 0 (mod i 15)) "fizzbuzz"
    (= 0 (mod i 5)) "buzz"
    (= 0 (mod i 3)) "fizz"
    :else i))

(defn translate [final-int]
  (loop [i   1
         acc [] ]
      (if (> i final-int)
        acc
        (recur (inc i)
               (conj acc (check-fizzbuzz i))))))
