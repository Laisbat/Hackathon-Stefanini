import { inherit } from "@uirouter/core";

export default class PaiController {

  constructor(paiService) {
    var vm = this;
    vm.name = 'Lindalberto';
    vm.teste = "teste 123!!!";

    init();

    function init(){
      paiService.getPais().then(
        function(resp) {
          console.log(resp);
        vm.pais = resp.data;
      });
    }
  }
  
}
PaiController.$inject = ['paiService'];
