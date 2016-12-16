(ns fruit-cart.core
(use [fruit-cart.file.parse-list])
(use [fruit-cart.pick.pick])
  (:gen-class))

(defn -main
  "A function that creates produce names."
  [& args]
  (println 
    (clojure.string/trim 
      (reduce 
        (fn [value category]
          (str value (pick-one (parse-list category)) " "))
        ""
        ["sizes" "adjectives" "countries" "fruit"]
      )
    )
  )
)

