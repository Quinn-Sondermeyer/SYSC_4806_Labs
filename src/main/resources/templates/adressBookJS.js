$(document).ready(function() {
    $.ajax({
        url: "http://rest-service.guides.spring.io/adressBook"
    }).then(function(data) {
        $('.addressBook-id').append(data.id);
        $('.addressBook-book').append(data.list);
    });
});