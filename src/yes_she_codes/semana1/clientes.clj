(ns yes-she-codes.semana1.clientes
  (:require [yes-she-codes.db :as y.db]
            ;[clojure.string :as s]
            ;[yes-she-codes.logic :as y.logic]
            [java-time :as time]
            [yes-she-codes.logic :as y.logic]
            ))





(println "\n\n ---------------- novo cliente ---------------- ")

(defn novo-cliente
  [nome cpf email]
  {:nome  nome
   :cpf   cpf
   :email email})

(let [nome "Gabriel"
      cpf "114.918.436-16"
      email "gabrielvcbessa@gmail.com"]
  (println (novo-cliente nome cpf email)))





(println "\n\n ---------------- lista clientes ---------------- ")

(defn lista-clientes
  []
  (let [clientes (y.logic/csv-reader "/Users/maria.carneiro/Documents/yes-she-codes-alura/yes-she-codes/src/yes_she_codes/csv/clientes.csv")]
    (println clientes))
  )

(lista-clientes)




