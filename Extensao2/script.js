function showSection(sectionId) {
    // Remove a classe 'active' de todas as seções
    document.querySelectorAll('section').forEach(section => {
        section.classList.remove('active');
    });
    
    // Adiciona a classe 'active' à seção selecionada
    document.getElementById(sectionId).classList.add('active');
    
    // Rola suavemente até o topo do conteúdo principal
    document.querySelector('main').scrollIntoView({ behavior: 'smooth' });
}

// Inicializa com a seção "Início" ativa
document.addEventListener('DOMContentLoaded', function() {
    showSection('home');
});