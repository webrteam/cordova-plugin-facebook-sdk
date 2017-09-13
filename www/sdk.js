/**
 * Created by likaituan on 11/09/2017.
 */

var exec = require('cordova/exec');

module.exports = {
	alertHello: function (message, success, fail) {
		exec(success, fail, 'Test', 'show', [message]);
	}
};