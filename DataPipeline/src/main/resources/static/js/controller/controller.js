app.controller('alcaldia', ['townHall', '$scope', '$location', function(townHall, $scope, $location){
	
	$scope.town_hall = [];
	townHall.townhall().then(function success(res) {
		$scope.town_hall = res;
	});
}]);


app.controller('unit', ['metrobus', '$scope', '$location', function(metrobus, $scope, $location){
	
	$scope.unitMetroBus = [];
	metrobus.metroBus().then(function success(res){
		$scope.unitMetroBus = res;
	});
}]);