var URL = '/api/';
app.service('crudApp', [ '$http', function($http) {
	return  {
		post: function(url, data){
			return $http({
				method: 'POST',
				url: URL + url,
				data: data, 
				headers: { 'Content-Type': 'application/json' }
			}).then(function success(res){
				return res.data;
			});
		},
		get: function(url){
			return $http.get(URL + url).then(function succes(res){
				return res.data
			});
		},
		put: function(url, data) {
			return $http({
				method: 'PUT',
				url: URL + url,
				data: data,
				headers: { 'Content-Type': 'application/json'}
			}).then(function success(res){
	        	return res.data;
	        });
		},
		delete: function(url) {
			return $http.delete(URL + url, null).then(function succes(res){
				return res.data;
			})
		}
	}
}]);