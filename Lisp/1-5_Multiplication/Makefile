CLISP = clisp
ARCHIVE	= $(shell basename `pwd`)

# clispをhomebrewでインストールします。
# setup:
# 	brew install $(CLISP)

# 実行ファイルを削除します。
clean:
	rm -f `find . -name "*.fas"` `find . -name "*.lib"`

#Lispプログラムを実行します。 
test: compile
	$(CLISP) `find . -name "*.fas"`

# Lispプログラムをコンパイルします。
compile:
	$(CLISP) -c `find . -name "*.lisp"`

# ディレクトリ内の不要なファイルを削除します。
wipe: clean
	@find . -name ".DS_Store" -exec rm {} ";" -exec echo rm -f {} ";"
	(cd ../ ; rm -f ./$(ARCHIVE).zip)

# 現在のディレクトリをZipファイルにします。
zip: wipe
	(cd ../ ; zip -r ./$(ARCHIVE).zip ./$(ARCHIVE)/ --exclude='*/.svn/*')
