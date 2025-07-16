//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.substancesourcematerial

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * 4.9.13.6.1 Author type (Conditional)
 *
 * 4.9.13.6.1 Author type (Conditional).
 *
 * @param id Unique id for inter-element referencing
 * @param authorType The type of author of an organism species shall be specified. The parenthetical
 * author of an organism species refers to the first author who published the plant/animal name (of any
 * rank). The primary author of an organism species refers to the first author(s), who validly
 * published the plant/animal name
 * @param authorDescription The author of an organism species shall be specified. The author year of
 * an organism shall also be specified when applicable; refers to the year in which the first author(s)
 * published the infraspecific plant/animal name (of any rank)
 */
@SerialName("SubstanceSourceMaterialOrganismAuthor")
@Serializable
public data class SubstanceSourceMaterialOrganismAuthor(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The type of author of an organism species shall be specified. The parenthetical author of an
   * organism species refers to the first author who published the plant/animal name (of any rank). The
   * primary author of an organism species refers to the first author(s), who validly published the
   * plant/animal name
   */
  public val authorType: CodeableConcept? = null,
  /**
   * The author of an organism species shall be specified. The author year of an organism shall also
   * be specified when applicable; refers to the year in which the first author(s) published the
   * infraspecific plant/animal name (of any rank)
   */
  public val authorDescription: String? = null,
) : BackboneElement
