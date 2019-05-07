import angular from 'angular';

class PaiService {

    constructor($http) {
        this.$http = $http;
        const apiBase = "http://localhost:8080";
        this.path =  apiBase + "/pai";
    }
 
    getPais() {
        return this.$http.get(`${this.path}/consultar`);
    }
 
    consultarPai() {
        return this.http.get(`${this.path}/consultar`);
    }
   
    salvarPai() {
        return this.http.post(`${this.path}/salvar`);
    }
    
    excluirPai() {
        return this.http.delete(`${this.path}/excluir`);
    }
    

}

export default angular.module('services.pai-service', [])
.service('paiService', PaiService)
.name;