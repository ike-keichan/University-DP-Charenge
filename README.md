# University-DP-Charenge

## status
作成期間：2019.11~2020.05　

## about
京都産業大学 コンピュータ理工学部 2018年度春 開講の「発展プログラミング演習」の練習問題を改めて暇つぶしに解いてみたもの。
練習問題は[こちら](https://ksuap.github.io/2018spring/)

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
+ できるだけラムダ式を用いてみる。
+ Apache Antを用いてjarファイルの生成を行う。
+ Apache Antを用いてJavaDocの生成を行う。
+ Apache Antを用いてアプリケーションの生成を行う。

### 実行方法
+ 実行
```
$make test
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

