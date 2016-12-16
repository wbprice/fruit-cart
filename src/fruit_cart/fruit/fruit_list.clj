(ns fruit-cart.fruit.fruit-list
(use [fruit-cart.file.parse-list]))

(defn fruit-list
  "Fetches a vector of fruits from a file."
  []
  (parse-list "fruit"))
