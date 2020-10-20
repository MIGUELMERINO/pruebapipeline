var app = angular.module('datapipeline', ['ngRoute']);


app.config(function($routeProvider){
	$routeProvider.when('/', {
		templateUrl : '/view/townhall',
		controller: 'alcaldia'
	}).when('/unit', {
		templateUrl: '/view/unit',
		controller: 'unit'
	}).when('/history', {
		templateUrl: '/view/history'
	}).when('/unittownhall', {
		templateUrl: '/view/unittownhall'
	});
});