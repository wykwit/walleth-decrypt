(defproject walleth-decrypt "0.1.0"
  :description "Decrypt WallETH and other KEthereum wallet exports to easily extract the raw private key."
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [org.jetbrains.kotlin/kotlin-stdlib "1.4.0"]
                 [org.bouncycastle/bcprov-jdk15on "1.69"]
                 [com.squareup.moshi/moshi "1.8.0"]
                 [com.github.komputing/khex "1.1.2"]
                 [com.github.komputing.khash/keccak "1.0.0"]
                 [com.github.komputing.kethereum/crypto "0.83.0"]
                 [com.github.komputing.kethereum/crypto_api "0.83.0"]
                 [com.github.komputing.kethereum/crypto_impl_bouncycastle "0.83.4"]
                 [com.github.komputing.kethereum/crypto_impl_java_provider "0.83.4"]
                 [com.github.komputing.kethereum/keccak_shortcut "0.83.0"]
                 [com.github.komputing.kethereum/extensions_kotlin "0.83.0"]
                 [com.github.komputing.kethereum/model "0.83.0"]
                 [com.github.komputing.kethereum/wallet "0.83.0"]]
  :repositories [["Liferay" "https://repository-cdn.liferay.com/nexus/content/groups/public/"]]
  :main walleth-decrypt.core
  :repl-options {:init-ns walleth-decrypt.core})
