(ns drawing.lines
  (:require [quil.core :as q]))

(defn setup []
  (q/frame-rate 30)
  (q/color-mode :rgb)
  (q/stroke 255 0 0))

(defn draw []
  ; call quil bg func
  (q/background 240))
