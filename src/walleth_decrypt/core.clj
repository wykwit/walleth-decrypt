(ns walleth-decrypt.core
  (:gen-class
    :name walleth_decrypt.core
    :main true)
  (:import
    [java.math BigInteger]
    [org.kethereum.wallet WalletFileKt]))

(defn usage []
  (println "Usage:  walleth-decrypt [path/to/export.json] [password]")
  (System/exit 1))

(defn -main [& args]
  (if (< (count args) 2) (usage))
  (try
    (let [wallet-json (slurp (first args))
          password (second args)
          wallet (WalletFileKt/loadKeysFromWalletJsonString wallet-json password)
          result (.toString wallet)
          privkey (BigInteger. (first (re-seq #"\d+" result)))]
      (println (format "Your key is: %X" privkey)))
    (catch Exception e
      (println "Error:" (.getMessage e))
      (System/exit 1))))

