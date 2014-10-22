(ns bufferplot.core
  (:gen-class)
  (:use [incanter core stats charts io pdf]))

(defonce plot (atom nil))

(defn plot-buffer*
  [name f]
  (with-data  (read-dataset f
                            :delim \space
                            :header false)
    (xy-plot ($ :col0) ($ :col1)
             :title (or name f)
             :x-label "Minutes"
             :y-label "Buffer Size (bytes)")))

(defn plot-buffer
  [name f]
  (view (reset! plot (plot-buffer* name f))))



(defn plot-data
  [name in out]
  (let [p  (plot-buffer* name in)]
    ;;(save @plot (str out ".png") :width 1280 :height 768)
    (save-pdf p out :width 1280 :height 768)))



(defn -main
  [name in out & args]
  (println "plotting... " name in out)
  (plot-data name in out))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(comment

  (-main "delia 10/22/14" "/mnt/sdcard/tmp/master-buffer.log" "/mnt/sdcard/tmp/delia.pdf")
  
  )