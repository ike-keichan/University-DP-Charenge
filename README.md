# University-DP-Charenge

## status
作成期間：2019.11~2020.05　

## about
京都産業大学 コンピュータ理工学部 2018年度春 開講の「発展プログラミング演習」の練習問題を改めて暇つぶしに解いてみたもの。
練習問題は[こちら](https://ksuap.github.io/2018spring/)

## Version
### Java
```
$ (export JAVA_HOME=`/usr/libexec/java_home -v "14"` ; java -version ; javac -version)
Picked up _JAVA_OPTIONS: -Dfile.encoding=UTF-8
java version "14.0.1" 2020-04-14
Java(TM) SE Runtime Environment (build 14.0.1+7)
Java HotSpot(TM) 64-Bit Server VM (build 14.0.1+7, mixed mode, sharing)
Picked up _JAVA_OPTIONS: -Dfile.encoding=UTF-8
javac 14.0.1
```

### Apache Ant
```
$ ant -version
Picked up _JAVA_OPTIONS: -Dfile.encoding=UTF-8
Apache Ant(TM) version 1.10.8 compiled on May 10 2020
```

### Make
```
$ make --version
GNU Make 3.81
Copyright (C) 2006  Free Software Foundation, Inc.
This is free software; see the source for copying conditions.
There is NO warranty; not even for MERCHANTABILITY or FITNESS FOR A
PARTICULAR PURPOSE.

This program built for i386-apple-darwin11.3.0
```

## Java
### purpose
+ 過去のプログラムのリファクタリング
+ Java復習
+ オブジェクト指向プログラミングの復習
+ 関数プログラミングの練習
+ ラムダ式のマスター
+ ビルドツール(Apache Ant)のマスター
+ コーディングの習慣化

### regulation
+ 命名規則をできる限りきちんと行う。
+ packageの宣言を行う。
+ importの宣言をできるだけ明示する。
+ Objectの継承を明示する。
+ フィールド、メソッドの設えをできるだけきちんと行う。
+ 修飾子をできるだけきちんと宣言する。
+ ゲッター、フッターを用いてできるだけ「カプセル化」を実現する。
+ 文字列連結にはできるだけStringBufferを用いる。（実行時間短縮のため）
+ ループ処理はできるだけStreamを用いてみる。
+ できるだけラムダ式・関数型インターフェースを用いてみる。
+ Apache Antを用いてjarファイルの生成を行う。
+ Apache Antを用いてJavaDocの生成を行う。
+ Apache Antを用いてアプリケーションの生成を行う。

### 実行方法
+ 実行
```
$make test
```

+　実行（引数を指定する場合）
```
$make test
$java -jar src.jar "引数"
```

+ Applicationの生成
```
$make install
```

+ JavaDocの生成
```
$make doc
```

+ ディレクトリをきれいにする
```
$make clean
```

## Lisp
### purpose
+ 関数プログラミングの練習
+ Lisp文法（S式）の練習
+ コーディングの習慣化

### regulation
+ 特になし。環境はCommon Lisp。

### 実行方法
+ 実行
```
$make test
```

+ ディレクトリをきれいにする
```
$make clean
```

