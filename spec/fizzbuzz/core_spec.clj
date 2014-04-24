(ns fizzbuzz.core_spec
  (:require [fizzbuzz.core :refer :all])
  (:require [speclj.core :refer :all]))

(describe "fizzbuzz"
  (it "converts ending at 1"
      (should= [1] (translate 1)))

  (it "converts ending at 2"
      (should= [1 2] (translate 2)))

  (it "converts ending at 3"
      (should= [1 2 "fizz"] (translate 3)))

  (it "converts ending at 4"
      (should= [1 2 "fizz" 4] (translate 4)))

  (it "converts ending at 5"
      (should= [1 2 "fizz" 4 "buzz"] (translate 5)))

  (it "converts ending at 15"
      (should= [1 2 "fizz" 4 "buzz" "fizz" 7 8 "fizz" "buzz" 11 "fizz" 13 14 "fizzbuzz"] (translate 15))))
