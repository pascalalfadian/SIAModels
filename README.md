# SIAModels

[![Maven Central](https://img.shields.io/maven-central/v/id.ac.unpar/SIAModels.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22id.ac.unpar%22%20AND%20a:%22SIAModels%22)

Java classes representing objects available in UNPAR's Sistem Informasi Akademik. Requires Java 1.8.

## Deploying

```sh
$ GPG_TTY=$(tty)
$ export GPG_TTY
$ mvn clean deploy
```

Why the two first commands? [because of this](https://stackoverflow.com/questions/57591432/gpg-signing-failed-inappropriate-ioctl-for-device-on-macos-with-maven).