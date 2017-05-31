uniform.project12("eff-parallel-4-2-0", "au.com.cba.zbi.effparallel", "zbi")

uniformDependencySettings

strictDependencySettings

uniformAssemblySettings

uniform.ghsettings

updateOptions := updateOptions.value.withCachedResolution(true)

libraryDependencies += "org.atnos" %% "eff" % "4.2.0"

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.3")