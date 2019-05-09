import { ParamTypes } from "@uirouter/core";

routing.$inject = ['$stateProvider', '$urlRouterProvider'];

export default function routing($stateProvider, $urlRouterProvider) {
    let homeState = {
        name: 'home',
        url: '/home',
        templateUrl: './modulos/home/home.view.html',
        controller: 'HomeController',
        controllerAs: 'vm'
      }
      $stateProvider.state(homeState);
      
      let paiState = {
        name: 'pai',
        url: '/pai',
        templateUrl: './modulos/pai/pai.view.html',
        controller: 'PaiController',
        controllerAs: 'vm'
      }
      $stateProvider.state(paiState);

      let paiCadastroState = {
        name: 'cadastro',
        url: '/cadastro',
        templateUrl: './modulos/cadastro-pai/cadastro.view.html',
        controller: 'CadastroController',
        controllerAs: 'vm',
        params: {
          'id': null
        } 
      }
      $stateProvider.state(paiCadastroState);
      
      
      $urlRouterProvider.otherwise('/home')  
}