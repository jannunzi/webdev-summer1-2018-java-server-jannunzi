//IIFE
(function () {

    jQuery(main);

    function main() {
        var h1 = jQuery('#title');
        h1.css('color', 'red');
        h1.html('User Administration!');

        var red = $('.red');
        var green = $('.green');
        var blue = $('.blue');

        red.css('color', 'white')
            .css('background-color', 'red')

        var tr = $('.template');

        var users = [
            {username: 'bob'},
            {username: 'charlie'}
        ];

        var tbody = $('tbody');

        for(var i=0; i<users.length; i++) {
            var user = users[i];
            console.log(user);
            var clone = tr.clone();
            clone.find('.username')
                .html(user.username);
            tbody.append(clone);
        }
    }

})();