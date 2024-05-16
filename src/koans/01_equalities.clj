(ns koans.01-equalities
  (:require [koan-engine.core :refer :all]))

(meditations
  "We shall contemplate truth by testing reality, via equality"
  (= __ true)

  "To understand reality, we must compare our expectations against reality"
  (= __ (+ 1 1))

  "Some things may appear different, but be the same"
  (= __ (= 2 2/1))

  "You cannot generally float to heavens of integers"
  (= __ (= 2 2.0))

  "But a looser equality is also possible"
  (= __ (== 2.0 2))

  "Something is not equal to nothing"
  (= __ (not (= 1 nil)))

  "What could be equivalent to nothing?"
  (= __ nil)

  "When things cannot be equal, they must be different"
  (not= :fill-in-the-blank __))
