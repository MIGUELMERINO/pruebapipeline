app.service('townHall', ['crudApp', function(crudApp) {
	return {
		townhall: function(data){
			return crudApp.get('town');
		}
	}
}]);


app.service('metrobus', ['crudApp', function(crudApp) {
	return {
		metroBus: function(data){
			return crudApp.get('metrobus');
		}
	}
}]);
