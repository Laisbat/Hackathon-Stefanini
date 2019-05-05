import angular from 'angular';
import uirouter from 'angular-ui-router';

import PaiController from './pai.controller';

import paiService from '../../servicos/pai.service';

export default angular.module('myApp.pai', [uirouter, paiService])
  .controller('PaiController', PaiController)
  .name;

  