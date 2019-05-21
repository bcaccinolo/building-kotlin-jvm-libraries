plugins {
    `build-scan`
    id("org.gradle.guides.getting-started") version "0.15.5"
    id("org.gradle.guides.test-jvm-code") version "0.15.5"
    id("org.gradle.guides.ci.travis") version "0.15.5"
}

configure<org.gradle.guides.GuidesExtension> {
    repoPath = "gradle-guides/building-kotlin-jvm-libraries"
}

buildScan {
    termsOfServiceUrl = "https://gradle.com/terms-of-service"
    termsOfServiceAgree = "yes"
}

configure<org.gradle.guides.ci.TravisExtension> {
    encryptedVariables.add("Nr8gmgB1vC7JK2ndKTUmR4DspvPH7zAxTNnt9M7Qitakw5WBLzHC+WC2mxtMpcvf0EMM82R2jvrvKlIDIN3SvehJQCA95g/Q4I1a6jjDupzx8ycSq0aWpXWHPbr1vlLu1idFrSMZfgAXm3+TsCjQImdDNDaSEoes17AVuIjbq+Nxr50i1gNYVe7Aiu6K+BOh7BEInIjC0I/ChFttjXBtzAnFAHFeXjaimtKDqLFdk1B7voa5aRx2Jb7DQBAyi/OqwlJqbnqnSy30vGjufSavY7tJg+TankNvWfMSMz8PMPucJUw5hvKHjxnsRTUoPCD33huGVpwWs56XKhvfB2Vw5KbLvQwRV6BG7ALdz53InTVcCrTX6ZMe584JM4buoFEpG3h7NPCsoWmV1c/uA4hyJ8VcmMAoaO2Uft0R4/Jw3VAqMzKD1BPepgvRsWbJGTZWLaBlcD7We04ovqziqq+kYg9cbcw36zf6IdT3LhHhl8Kilkmf6U6VS2RAZ82kcb8AVQ4hBn1JGGitcHVSvsovo8l8meMVSAcfm3ZT223mwiP+ulD4BvMJyUbVn4yfG1IOiOILs20ATEWABV2U7eGGP31Zj5ucU25EbSPGGsBg9PEqMg4dBM2aIA7x+0KggyiyaQxcOkwEYWxwQ8yHOrciem0gHoEUXsT7cG3pMZJ97Yw=")
}
