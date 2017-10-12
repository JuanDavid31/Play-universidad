function deleteRequest(id){
    console.log(id);
    $.ajax({
        url: deleteUrl,
        method: "DELETE",
        succes: function(){
            windows.location = redirectUrl;
        },
        error: function(){
            window.location.reload();
        }
    });

}