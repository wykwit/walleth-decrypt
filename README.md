# walleth-decrypt

Decrypt [WallETH](https://github.com/walleth/walleth) and other [KEthereum](https://github.com/komputing/KEthereum) wallet exports to easily extract the raw private key.
You can then use the exported private key to migrate to any other wallet software.

## run

Either use `lein run` or use a .jar from any of the releases.

Example:
```
java -jar walleth-decrypt-0.1.0-standalone.jar "export.json" "password"
```

## build

```
lein uberjar
```

For a list of dependencies see the `project.clj` file.`

## license

MIT
