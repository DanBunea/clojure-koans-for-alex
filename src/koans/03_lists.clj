(ns koans.03-lists
  (:require [koan-engine.core :refer :all]))

(meditations
  "Lists can be expressed by function or a quoted form"
  (= '(__ __ __ __) (list 1 2 3 4))

  "They are Clojure seqs (sequences), so they allow access to the first"
  (= __ (first '(1 2 3 4 5)))

  "Last"
  (= __ (last '(1 2 3 4 5)))

  "Before they are gone"
  (= __ (concat '(1 2) '(3 4)))

  "Construction by adding an element to the front is easy"
  (= __ (cons :a '(:b :c :d :e)))

  "Conjoining an element to a list isn't hard either"
  (= __ (conj '(:a :b :c :d) :e))

  "Removing the last"
  (= __ (drop-last '(:a :b :c :d)))

  "Removing the first 2 elements"
  (= __ (drop 2 '(:a :b :c :d)))

)