'use strict';

import angular from 'angular'
import uirouter from 'angular-ui-router';
var blockUI = require('angular-block-ui');

import 'bootstrap';
import './scss/app.scss';

import routing from './app.config';

import cadastro from './modulos/cadastro-pai/cadastro.js';
import pai from './modulos/pai/pai.js';
import home from './modulos/home/home.js';

angular
.module('myApp', [
  uirouter,
  blockUI,
  pai,
  cadastro, 
  home
])
.config(routing);