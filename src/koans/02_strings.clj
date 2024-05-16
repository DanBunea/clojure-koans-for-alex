(ns koans.02-strings
  (:require [koan-engine.core :refer :all]))

(meditations
  "A string is nothing more than text surrounded by double quotes"
  (= __ "hello")

  "You can do more than create strings, you can put them together"
  (= "Cool right?" (str __ __))

  "Or even count the characters"
  (= __ (count "Hello World"))
  )
