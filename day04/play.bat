@echo off
set /p filename=name?
javac -d . -encoding utf8 %filename%.java
java com.bit.day04.%filename%