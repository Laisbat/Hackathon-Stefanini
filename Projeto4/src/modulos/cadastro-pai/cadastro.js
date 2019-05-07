import angular from 'angular';
import uirouter from 'angular-ui-router';

import CadastroController from './cadastro.controller';

import PaiService from '../../servicos/pai.service';

export default angular.module('myApp.cadastro', [uirouter, PaiService])
  .controller('CadastroController', CadastroController)
  .name;
