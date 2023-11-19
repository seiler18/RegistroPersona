// Script para mostrar un cuadro de confirmación al intentar eliminar una persona
document.addEventListener("DOMContentLoaded", function() {
    var deleteButtons = document.querySelectorAll(".btn-danger");

    deleteButtons.forEach(function(button) {
        button.addEventListener("click", function(event) {
            var confirmDelete = confirm("¿Estás seguro de que deseas eliminar esta persona?");
            if (!confirmDelete) {
                event.preventDefault();
            }
        });
    });
});

