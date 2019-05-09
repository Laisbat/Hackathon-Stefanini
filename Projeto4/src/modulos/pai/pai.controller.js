import { inherit } from "@uirouter/core";

export default class PaiController {

  constructor(paiService) {
    var vm = this;
    vm.pais = {};
    vm.resp = null;
    vm.buscarTodos = null;
    vm.excluir = null;
    vm.consultar = null;
    vm.cadastrarPai = null;
    vm.maxSize = 20;
    vm.cadastrarFilho = null;
    init();

    function init() {

      vm.cadastrarPai = function () {
        console.log(vm.pai);
        vm.pai.path = null;
        paiService.post(vm.pai)
          .then(function response(resp) { 
            console.log(resp);
          }).catch(function (error) { 
            console.log(error);
          });
      }

      vm.buscarTodos = function () {
        console.log("Efetuando requisição");
        paiService.getPais()
          .then(function response(resp) {
            vm.pai = resp.data;
          }).catch(function (error) { 
            console.log(error);
          });
      }

      vm.cadastrarFilho = function () {
        console.log(vm.filho);
        paiService.salvarPai(vm.filho)
          .then(function response(resp) { 
            console.log(resp);
          }).catch(function (error) { 
            console.log(error);
          });
      }

      vm.excluir = function (id) {
        paiService.excluirPai(id)
          .then(function response(resp) {
            alert('Pai excluído com sucesso!');
            vm.buscarTodos();
          }).catch(function error(error) {
            console.log(error);
          });
      }

      vm.buscarTodos();
    }

  }
}

PaiController.$inject = ['paiService'];

