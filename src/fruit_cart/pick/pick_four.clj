(ns fruit-cart.pick.pick-four)

(defn pick-one
  "Given a vector, picks four items randomly."
  [things]
  (get things (rand-int 10)))
