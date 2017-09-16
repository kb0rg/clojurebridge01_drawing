(ns drawing.lines
  (:require [quil.core :as q]))

(defn setup []
  (q/frame-rate 30)
  (q/color-mode :rgb)
  (q/stroke 255 0 0))

(defn draw []
  ; call quil bg func
  
  (q/background 240) ; remove bg to make lines cumulative
  (q/stroke 0 255 0)
  (q/line 0 0 (q/mouse-x) (q/mouse-y))
  (q/stroke 0 0 255)
  (q/line 500 0 (q/mouse-x) (q/mouse-y))
  (q/stroke 0 255 255)
  (q/line 0 500 (q/mouse-x) (q/mouse-y))
  (q/stroke 0 255 125)
  (q/line 500 500 (q/mouse-x) (q/mouse-y)))

(q/defsketch hello-lines
  :title "kborg does or does not do lines"
  :size [500 500]
  :setup setup
  :draw draw
  :features [:keep-on-top])
