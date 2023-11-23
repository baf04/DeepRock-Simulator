CREATE TABLE `Amigos` (
  `id_usuario` integer NOT NULL,
  `id_amigo` integer NOT NULL,
  PRIMARY KEY (`id_usuario`, `id_amigo`)
);

CREATE TABLE `Usuarios` (
  `id` integer PRIMARY KEY AUTO_INCREMENT NOT NULL,
  `correo` varchar(255) NOT NULL unique,
  `password` varchar(255) NOT NULL
);

CREATE TABLE `Partida` (
  `id` integer AUTO_INCREMENT NOT NULL,
  `id_to_usuarios` integer NOT NULL,
  `Nombre` varchar(255) NOT NULL,
  `Exp` integer NOT NULL,
  `Creditos` integer NOT NULL,
  PRIMARY KEY (`id`, `id_to_usuarios`)
);

CREATE TABLE `Mineros` (
  `id_to_Partida` integer NOT NULL,
  `Exp` integer NOT NULL,
  `Clase` varchar(255) NOT NULL,
  `Mejoras` integer NOT NULL,
  PRIMARY KEY (`id_to_Partida`, `Clase`)
);

CREATE TABLE `Mision` (
  `id` integer AUTO_INCREMENT NOT NULL,
  `id_to_Partida` integer NOT NULL,
  `Dificultad` varchar(255) NOT NULL,
  `Clase` varchar(255) NOT NULL,
  `Creditos` integer NOT NULL,
  `ExperienciaPartida` integer NOT NULL,
  `ExperienciaMinero` integer NOT NULL,
  `Resultado` varchar(255) NOT NULL,
  PRIMARY KEY (`id`, `id_to_Partida`)
);

ALTER TABLE `Amigos` ADD FOREIGN KEY (`id_usuario`) REFERENCES `Usuarios` (`id`);

ALTER TABLE `Amigos` ADD FOREIGN KEY (`id_amigo`) REFERENCES `Usuarios` (`id`);

ALTER TABLE `Mision` ADD FOREIGN KEY (`id_to_Partida`) REFERENCES `Partida` (`id`) ON DELETE CASCADE;

ALTER TABLE `Partida` ADD FOREIGN KEY (`id_to_usuarios`) REFERENCES `Usuarios` (`id`) ON DELETE CASCADE;

ALTER TABLE `Mineros` ADD FOREIGN KEY (`id_to_Partida`) REFERENCES `Partida` (`id`) ON DELETE CASCADE;
