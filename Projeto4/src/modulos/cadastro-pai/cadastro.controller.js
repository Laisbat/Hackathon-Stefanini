import { inherit } from "@uirouter/core";

export default class CadastroController {

  constructor(paiService) {
    var vm = this;
    vm.name = 'Lindalberto';
    vm.teste = "teste 123!!!";

    init();

    function init(){
    }
  }
  
}
CadastroController.$inject = ['paiService'];
