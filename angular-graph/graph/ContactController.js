var app = angular.module('GraphApp', ['ng-fusioncharts']);
app.controller('ContactController', function ($scope, $http) {

$scope.val=[];
    setInterval(function(){
    $http({
        method: 'GET',
        url: 'http://192.168.1.109:8180/ConsumerApi/getEnrollments'
    }).then(function successCallback(response) {
       // console.log(response.data);
        $scope.val = response.data;
        // this callback will be called asynchronously
        // when the response is available
    }, function errorCallback(response) {
        // called asynchronously if an error occurs
        // or server returns response with an error status.
    });
    }, 1000);
    console.log($scope.val);
    $http({
        method: 'GET',
        url: 'http://ip.jsontest.com/'
    }).then(function successCallback(response) {
        console.log(response);
        // this callback will be called asynchronously
        // when the response is available
    }, function errorCallback(response) {
        // called asynchronously if an error occurs
        // or server returns response with an error status.
    });
    $scope.myDataSource = {
        chart: {
            caption: "Vamshi graph",
            subCaption: "check",
            numberPrefix: "",
            xAxisName: "Minutes",
            yAxisName: "No Of enrollments",
            theme: "yo"
        },
        data: $scope.val
    };

    setInterval(function(){
        //do what you need here
        $scope.myDataSource = {
            chart: {
                caption: "Vamshi graph",
                subCaption: "check",
                numberPrefix: "",
                theme: "yo"
            },
            data: $scope.val
        };
       // console.log($scope.myDataSource);
    }, 1000);


});