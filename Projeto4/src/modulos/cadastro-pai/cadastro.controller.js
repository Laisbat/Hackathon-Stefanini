import { inherit } from "@uirouter/core";

export default class CadastroController {

  constructor(paiService) {
    var vm = this;
    vm.error = null;

    init();

    function init() {
      vm.filhos = [];
      vm.adicionaFilho = adicionaFilho;
      vm.cadastrarPai = function () {
        vm.pai.filhos = [];
        vm.pai.filhos = getFilhos();
        if (!vm.pai.nome) {
          vm.error = "Preencha o campo nome.";
          return;
        }

        paiService.salvarPai(vm.pai)
          .then(function response(resp) {
            vm.error = "";
            vm.pai = null;
            alert("Cadastrado com sucesso!");
          }).catch(function (error) {
            vm.error = "Houve uma falha na requisição.";
          });
      }

      vm.cadastrarFilho = function () {
        console.log(vm.filhos);
        paiervice.postPagina(vm.filhos)
          .then(function response(resp) {
            console.log(resp);
          }).catch(function (error) { 
            console.log(error);
          });
      }

      vm.limparPai = function() {
        vm.pai = null;
      };

      function adicionaFilho(filhos) {
        vm.filhos.push(filhos);
      }
         
      function getFilhos(){
        return vm.filhos;
      }
    }
  }

}
CadastroController.$inject = ['paiService'];
