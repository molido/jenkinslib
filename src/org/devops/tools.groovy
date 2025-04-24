package org.devops

//格式化输出
def PrintMes(value, color){
  colors = ['red' : "\033[40;31m >>>>>>>>>>>${value} <<<<<<<<<<<< \033[0m", 
           'blue' : "\033[47;34m ${value} \033[0m"]
  ansiColor('xterm'){
    printlin(colors[color])
  }
}
