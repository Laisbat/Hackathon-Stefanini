import { inherit } from "@uirouter/core";

export default class PaiController {

  constructor(paiService) {
    var vm = this;
    this.name = 'Pai';

    init();

    function init(){
      paiService.getPais().then(function abc(resp) {
        vm.pais = resp.data;
      });
    }
  }
  
}
PaiController.$inject = ['paiService'];
