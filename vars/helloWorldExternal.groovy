def call(Map config = [:]) {
    //for linux
   // loadLinuxScript(name: 'hello-world.sh')
   // sh "./hello-world.sh ${config.name} ${config.dayOfWeek}"
    
    //for Windows OS
      loadScript(name: 'hello-world.bat')
      bat "./hello-world.bat ${config.name} ${config.dayOfWeek}"
}
