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
    
    getByName(paramPesquisa) {
    	return this.$http.get(this.path + '/nome/' + paramPesquisa);
    }
   
    salvarPai(pai) {
        return this.$http.post(`${this.path}/salvar`, {'nome': pai.nome, 'id': pai.id});
    }
    
    excluirPai() {
        return this.$http.delete(`${this.path}/excluir`);
    }
    deleteById(id){
    	return this.$http.delete(this.path + '/' + id);
    }

}

export default angular.module('services.pai-service', [])
.service('paiService', PaiService)
.name;