def call(Map config = [:]) {
    //for linux
   // loadLinuxScript(name: 'hello-world.sh')
   // sh "./hello-world.sh ${config.name} ${config.dayOfWeek}"
    
    //for Windows OS
      loadScript(name: 'windows.bat')
      bat "./windows.bat ${config.name} ${config.dayOfWeek}"
}
